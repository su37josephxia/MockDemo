var Mock4JS = require('mock4js')
var unit = require('jsunit')
var AClass = require('./AClass.js')
var BClass = require('./BClass.js')
console.log('AAA',BClass)


function run() {

    Mock4JS.addMockSupport(this);

    //console.log('after', this)

    Mock4JS.clearMocksToVerify();

    // setup
    var mockBClass = mock(BClass);
    var aClass = new AClass();
    aClass.setBClass(mockBClass.proxy());

    // expectations
    mockBClass.expects(once())
        .doMethod(ANYTHING)
        .will(returnValue("I am Mock"));

    // execute
    aClass.doMethod("some text");
}
run()


//function setUp() {
//    Mock4JS.clearMocksToVerify();
//}
//function tearDown() {
//    Mock4JS.verifyAllMocks();
//}
//function testOneSubscriberReceivesAMessage() {
//
//    // setup
//    var mockSubscriber = this.mock(Subscriber);
//    var publisher = new Publisher();
//    publisher.add(mockSubscriber.proxy());
//    var message = "message";
//
//    // expectations
//    mockSubscriber.expects(this.once()).receive(ANYTHING);
//
//    // execute
//    publisher.publish(message);
//}