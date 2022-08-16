
def amount_of_pages(summary: int):
    pages = ''
    for pageNum in range(1, summary+1):
        pages += str(pageNum)
        if len(pages) >= summary:
            return pageNum


print(amount_of_pages(5))