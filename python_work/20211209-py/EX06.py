import numpy as np

arr1 = np.arange(0, 8).reshape(2, 4)
arr2 = np.arange(0, 8).reshape(2, 4)

print()
arr3 = np.concatenate([arr1, arr2], axis=0)
print(arr3)

print()
arr4 = np.arange(0, 4).reshape(4, 1)
print(arr4)

print()
arr5 = arr3 + arr4
print(arr5)