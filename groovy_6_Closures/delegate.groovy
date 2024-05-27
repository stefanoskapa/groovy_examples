//delegate

def writer = {
  append 'John'
  append ' has three cats'
}

StringBuilder sb = new StringBuilder()
writer.delegate = sb
writer()