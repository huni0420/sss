


import cv2

img = cv2.imread('AA.jpg')

# # h 180 w 250
#
# roi = img[340:600, 400:750]
# # roi = img[120:300, 300:550]
# cv2.imshow('roi', roi)
# cv2.waitKey(0)
#
# img[0:260, 0:350] = roi
# # img[0:180, 0:250] = roi
# cv2.imshow('img', img)
# cv2.waitKey(0)

cv2.imshow('img', img[:, :, 0]) # 한개부분 보여주면 gray 흑백처리
cv2.waitKey(0)

img[:, :, 0] = 0 # 파란색 부분 제거
cv2.imshow('img', img)
cv2.waitKey(0)