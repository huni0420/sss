import numpy as np
import os
import cv2
from sklearn.neighbors import KNeighborsClassifier

folders = range(0, 13)

train_input = []
train_target = []

for folder in folders:
    path = './train_data/' + str(folder) + '/'
    file_count = len(next(os.walk(path))[2])
    for file in range(1, file_count + 1):
        img = cv2.imread(path + str(file) + '.png')
        gray_img = cv2.cvtColor(img, cv2.COLOR_RGB2GRAY)
        gray_img = gray_img.reshape(400)
        train_input.append(gray_img)
        train_target.append(folder)



train_input = np.array(train_input)
train_target = np.array(train_target)
print(train_input.shape)
print(train_target.shape)
print(train_target[:])

np.savez("traintest.npz",train = train_input,target = train_target)
knclf = KNeighborsClassifier(n_neighbors=1)
knclf.fit(train_input, train_target)

predvalue = knclf.predict([train_input[0],
                           train_input[1],
                           train_input[2],
                           train_input[10]
                           ])
print(predvalue)

# print(train_input[0])
# print(train_target[1])
# print(train_input.shape)
# print(train_target.shape)
