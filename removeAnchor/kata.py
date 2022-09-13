def remove_url_anchor(url: str):
    return url[:url.find('#') if url.find('#') != -1 else len(url)]

print(remove_url_anchor('www.codewars.com'))