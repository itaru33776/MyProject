import tkinter as tk
from tkinter import filedialog
import pygame
from PIL import Image, ImageTk

class PomodoroApp:
    def __init__(self, root):
        self.root = root
        self.root.title("蕃茄鐘")
        self.remaining_time = 25 * 60
        self.running = False
        self.music_file = None
        self.is_paused = False
        self.bg_image = None

        self.canvas = tk.Canvas(root, width=400, height=300)
        self.canvas.pack(fill="both", expand=True)

        self.timer_label = tk.Label(root, text=self.format_time(self.remaining_time), font=("Arial", 24), bg="white")
        self.timer_label.place(relx=0.5, rely=0.3, anchor="center")

        # 將按鈕排成上下兩列，每列三個
        self.button_frame = tk.Frame(root)
        self.button_frame.place(relx=0.5, rely=0.7, anchor="center")

        self.start_button = tk.Button(self.button_frame, text="開始", command=self.start_timer, width=10)
        self.start_button.grid(row=0, column=0, padx=5, pady=5)

        self.pause_button = tk.Button(self.button_frame, text="暫停", command=self.pause_timer, width=10)
        self.pause_button.grid(row=0, column=1, padx=5, pady=5)

        self.stop_button = tk.Button(self.button_frame, text="停止", command=self.stop_timer, width=10)
        self.stop_button.grid(row=0, column=2, padx=5, pady=5)

        self.load_music_button = tk.Button(self.button_frame, text="載入音樂", command=self.load_music, width=10)
        self.load_music_button.grid(row=1, column=0, padx=5, pady=5)

        self.mute_button = tk.Button(self.button_frame, text="靜音", command=self.mute_music, width=10)
        self.mute_button.grid(row=1, column=1, padx=5, pady=5)

        self.load_bg_button = tk.Button(self.button_frame, text="載入背景", command=self.load_bg_image, width=10)
        self.load_bg_button.grid(row=1, column=2, padx=5, pady=5)

        pygame.mixer.init()

    def format_time(self, seconds):
        minutes = seconds // 60
        seconds = seconds % 60
        return f"{minutes:02d}:{seconds:02d}"

    def update_timer(self):
        if self.running:
            if self.remaining_time > 0:
                self.remaining_time -= 1
                self.timer_label.config(text=self.format_time(self.remaining_time))
                self.root.after(1000, self.update_timer)
            else:
                self.running = False
                self.timer_label.config(text="時間到！")
                if self.music_file:
                    pygame.mixer.music.play(-1)

    def start_timer(self):
        if not self.running:
            self.running = True
            self.update_timer()

    def pause_timer(self):
        if self.running:
            self.running = False
            self.is_paused = True
        elif self.is_paused:
            self.running = True
            self.is_paused = False
            self.update_timer()

    def stop_timer(self):
        self.running = False
        self.remaining_time = 25 * 60
        self.timer_label.config(text=self.format_time(self.remaining_time))
        pygame.mixer.music.stop()

    def load_music(self):
        self.music_file = filedialog.askopenfilename(filetypes=[("音樂文件", "*.mp3 *.wav")])
        if self.music_file:
            pygame.mixer.music.load(self.music_file)
            pygame.mixer.music.play(-1)  # -1表示重複播放
        else:
            print("未找到音樂文件進行播放")
        

    def mute_music(self):
        pygame.mixer.music.set_volume(0 if pygame.mixer.music.get_volume() > 0 else 1)

    def load_bg_image(self):
        bg_file = filedialog.askopenfilename(filetypes=[("圖像文件", "*.png *.jpg *.jpeg")])
        if bg_file:
            self.bg_image = Image.open(bg_file)
            self.bg_image = self.bg_image.resize((400, 300), Image.Resampling.LANCZOS)
            self.bg_image = ImageTk.PhotoImage(self.bg_image)
            self.canvas.create_image(0, 0, image=self.bg_image, anchor="nw")

if __name__ == "__main__":
    root = tk.Tk()
    app = PomodoroApp(root)
    root.mainloop()
