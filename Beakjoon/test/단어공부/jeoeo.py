word = input().upper()
setword = set(word)

max_count = 0
result = ""
for char in setword:
  count = word.count(char)

  if count > max_count:
    max_count = count
    result = char

  elif count == max_count:
    result = "?"

print(result)
