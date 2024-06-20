/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function (nums1, nums2) {
    let left = 0,
        right = 0;
    const mergedArray = [];

    while (left < nums1.length && right < nums2.length) {
        if (nums1[left] < nums2[right]) {
            mergedArray.push(nums1[left++]);
        } else {
            mergedArray.push(nums2[right++]);
        }
    }

    while (left < nums1.length) {
        mergedArray.push(nums1[left++]);
    }

    while (right < nums2.length) {
        mergedArray.push(nums2[right++]);
    }

    const halfLength = Math.floor(mergedArray.length / 2);

    if (mergedArray.length % 2 === 0) {
        return (mergedArray[halfLength - 1] + mergedArray[halfLength]) / 2;
    }

    return mergedArray[halfLength];
};