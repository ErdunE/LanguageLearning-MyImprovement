# say_hello()

# python解释器知道下方定义了一个函数

name = "小明"

# 注意：定义了函数之后，只表示了这个函数封装了一段代码而已
# 如果不调动函数，函数是不会主动执行的
def say_hello():
    """打招呼"""
    print("Hello 1")
    print("Hello 2")
    print("Hello 3")

print(name)

# 只有在程序中主动调用函数，函数才会执行
say_hello()

print(name)
