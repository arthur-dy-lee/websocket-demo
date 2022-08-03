package arthur.dy.lee.websocket;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;

/**
 * @author Arthur.li
 * @since 2022/8/3 20:00
 */
public class MyWebSocketClient extends WebSocketClient {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public MyWebSocketClient(URI serverUri) {
        super(serverUri);
    }

    @Override
    public void onOpen(ServerHandshake serverHandshake) {
        logger.info("[MyWebSocketClient#onOpen]The WebSocket connection is open.");
    }

    @Override
    public void onMessage(String s) {
        logger.info("[MyWebSocketClient#onMessage]The client has received the message from server." +
                "The Content is [" + s + "]");
    }

    @Override
    public void onClose(int i, String s, boolean b) {
        logger.info("[MyWebSocketClient#onClose]The WebSocket connection is close.");
    }

    @Override
    public void onError(Exception e) {
        logger.info("[MyWebSocketClient#onError]The WebSocket connection is error.");
    }
}
