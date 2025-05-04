%{"abc"=> "def", "ghi" => 123} # マップ
%{abc: "def", ghi: 123} # キーがatomのマップ

%{abc: "world"} == %{:abc => "world"} # true)
