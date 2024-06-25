/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function (functions) {
    if (functions.length === 0) {
        return x => x;
    }
    return function (x) {
        let output = x;
        for (let i = functions.length - 1; i >= 0; i--) {
            output = functions[i](output);
        }
        return output;
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */