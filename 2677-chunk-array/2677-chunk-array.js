/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function (arr, size) {
    var chunkedArray = [];
    for (var i = 0; i < arr.length; i += size) {
        chunkedArray.push(arr.slice(i, i + size));
    }
    return chunkedArray;
};
