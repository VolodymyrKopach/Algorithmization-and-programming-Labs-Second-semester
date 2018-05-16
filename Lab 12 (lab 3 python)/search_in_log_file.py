import re


def search_in_log_file():
    count = 0
    file = open('server.log.2018-04-04')
    for line in file:
        if re.search("(Caused by)|(deployment\.\w+\.war)", str(line)):
            count+=1
            print(line)
    print(count)


if __name__ == "__main__":
    search_in_log_file()