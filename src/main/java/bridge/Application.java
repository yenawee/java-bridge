package bridge;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        BridgeNumberGenerator numberGenerator = new BridgeRandomNumberGenerator();
        BridgeMaker bridgeMaker = new BridgeMaker(numberGenerator);
        InputView inputView = new InputView();
        Game game = new Game();
        System.out.println("다리 건너기 게임을 시작합니다.");
        System.out.println();
        System.out.println("다리의 길이를 입력해주세요.");
        int bridgeSize = inputView.readBridgeSize(inputView.readline());
        List<String> bridge = bridgeMaker.makeBridge(bridgeSize);
        System.out.println(bridge);
        game.Start(bridge, bridgeSize);
    }
}
