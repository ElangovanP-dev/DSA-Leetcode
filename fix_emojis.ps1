$files = Get-ChildItem -Path "c:\Users\elang\OneDrive\Desktop\DSA_LeetCode" -Recurse -Filter "README.md"

foreach ($file in $files) {
    $content = Get-Content $file.FullName -Encoding UTF8 -Raw
    $content = $content.Replace('## ðŸ§© Problem', '## Problem')
    $content = $content.Replace('## ðŸ’¡ Approach', '## Approach')
    $content = $content.Replace('## â±ï¸ Complexity', '## Complexity')
    $content = $content.Replace('## 🧩 Problem', '## Problem')
    $content = $content.Replace('## 💡 Approach', '## Approach')
    $content = $content.Replace('## ⏱️ Complexity', '## Complexity')
    Set-Content $file.FullName -Value $content -Encoding UTF8
}