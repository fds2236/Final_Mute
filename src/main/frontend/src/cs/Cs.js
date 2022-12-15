import 'bootstrap/dist/css/bootstrap.min.css';
import { Accordion } from 'react-bootstrap';

function Cs() {



    return(
        <>
            <h3>고객센터 페이지입니다</h3>
            <p>자주하는 질문 BEST 3</p>
            <Accordion defaultActiveKey="0">
                <Accordion.Item eventKey="0">
                    <Accordion.Header>Q : 공연예매 후 좌석변경을 할 수 있나요?</Accordion.Header>
                    <Accordion.Body>
                        예매 완료 후에는 좌석을 변경할 수 없습니다. <br/>
                        변경을 원하시는 경우 [마이티켓 👉  예매/취소] 메뉴에서 해당 예매 건을 취소하시고 재 예매하셔야 합니다.<br />
                        예매 건을 취소하는 경우 예매수수료, 취소수수료는 멜론티켓 수수료 정책에 따라 발생합니다.
                    </Accordion.Body>
                </Accordion.Item>

                <Accordion.Item eventKey="1">
                    <Accordion.Header>Q : 공연이 취소되었는데 이후 처리는 어떻게 되나요?</Accordion.Header>
                    <Accordion.Body>
                        주최측의 사유로 공연이 취소될 경우, 결제하신 전체 금액을 환불해드리게 됩니다.
                    </Accordion.Body>
                </Accordion.Item>

                <Accordion.Item eventKey="2">
                    <Accordion.Header>Q : 티켓 취소를 하려면 어떻게 해야 하나요?</Accordion.Header>
                    <Accordion.Body>
                        마이티켓 👉 예매확인/취소 메뉴를 통해 취소를 진행하실 수 있습니다. <br/>
                        콜센터를 통해 예매를 진행하신 경우, 콜센터(1234-5678)로 문의하시면 상담원을 통해 취소하실 수 있습니다.
                    </Accordion.Body>
                </Accordion.Item>
            </Accordion>
        </>

    )
}
export default Cs;