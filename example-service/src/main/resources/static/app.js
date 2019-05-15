var stompClient = null;
$( document ).ready(function() {
 $("#notifciations").html("");
   connect();
});
function connect() {
    var socket = new SockJS('/calendly-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/notifications', function (message) {
            showNotification(JSON.parse(message.body).subject);
        });
    });
}
function showNotification(message) {
    $("#notifications").append("<tr><td>" + message + "</td></tr>");
}
