student =set([ i+1 for i in range(30)])
submittedStudent=set([])

for i in range(28):
    submittedStudent.add(int(input()))

for i in sorted(student-submittedStudent):
    print(i)
