/**
 * @param {Function} fn
 * @return {Object}
 */
Array.prototype.groupBy = function (fn) {
    const grouped = {};
    for (i = 0; i < this.length; i++) {
        const index = fn(this[i]);
        if (!grouped[index]) {
            grouped[index] = [];
        }
        grouped[index].push(this[i]);
    }
    return grouped;

};

/**
 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
 */