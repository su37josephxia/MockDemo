/**
 * Created by xia on 16/7/21.
 */

// 测试对象
function BClass() {
}
BClass.prototype = {
    doMethod: function (message) {
        return 'I am BClass'
    }
}

module.exports = BClass;