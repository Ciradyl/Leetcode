/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function (arr, fn) {
    let filteredArr = [];

    for (i = 0; i < arr.length; i++) {
        let index = arr[i];
        if (Boolean(fn(index, i))) {
           filteredArr.push(index) ;
        }
    }

    return filteredArr;
};