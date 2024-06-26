/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function (...args) {
    let argumentsLength = args.length
    return argumentsLength;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */