import axios from 'axios';
import icon from '../../assets/img/Vector.svg';
import { BASE_URL } from '../../utils/request';
import './style.css'

type Props = {
    saleId: number;
}

function handleClick(id: number) {
    axios(`${BASE_URL}/sales/${id}/notification`)
    .then(response => {
        console.log("Mensagem enviada!")
    })
}

function NotificationButton( {saleId}: Props) {
    return (
        <div className="brmeta-red-btn" onClick={() => {handleClick(saleId)}}>
            <img src={icon} alt="Botão_Notificar"/>
        </div>
    )
}

export default NotificationButton;
