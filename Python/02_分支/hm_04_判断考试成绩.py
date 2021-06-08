# 练习2： 定义两个整数变量 python_score, c_score，编写代码判断成绩

python_score = int(input("请输入Python的成绩："))
c_score = int(input("请输入C的成绩："))

# 要求只要有一门成绩 >60 分就算合格

if python_score >=60 or c_score >= 60:
    print("考试通过")
else:
    print("考试失败，请继续努力")