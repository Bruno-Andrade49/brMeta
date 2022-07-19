import logo from "../../assets/img/image 1.svg";
import './style.css'



function Header() {
    return (
        <header>
        <div className="brmeta-logo-container">
            <img src={logo} alt="BRMeta" />
            <h1>BRMeta</h1>
            <p>
              Desenvolvido por
              <a href="https://www.instagram.com/brunoandradee__/"> @brunoandradee__</a>
            </p>
        </div>
    </header>
    )
  }

export default Header;