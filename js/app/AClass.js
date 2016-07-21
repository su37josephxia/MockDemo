/**
 * Created by xia on 16/7/21.
 */

function AClass() {
    var bClass

}
AClass.prototype = {
    setBClass: function setBClass(obj) {
        bClass = obj
    },
    doMethod: function (msg) {
        console.log('bClass',bClass)

        var ret = bClass.doMethod('someText')

        console.log('bClass return:' + ret)
    }
}

module.exports = AClass;
