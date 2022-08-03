package arthur.dy.lee.websocket;

import org.springframework.web.socket.WebSocketSession;

/**
 * @author Arthur.li
 * @since 2022/8/3 19:53
 */

public class WebSocketBean {

    private WebSocketSession webSocketSession;
    private int              clientId;

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public WebSocketSession getWebSocketSession() {
        return webSocketSession;
    }

    public void setWebSocketSession(WebSocketSession webSocketSession) {
        this.webSocketSession = webSocketSession;
    }
}
