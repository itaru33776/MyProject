import pandas as pd

# 讀取 Excel 特定工作表
df = pd.read_excel("原始檔案.xlsx", sheet_name="目標工作表名稱")

# 將資料存成 ODS（需 odfpy 支援）
df.to_excel("輸出檔案.ods", engine="odf")