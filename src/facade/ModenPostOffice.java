package facade;

/**
 * 现代化邮局
 * 
 * 其实这个就是一个门面，也就是给别人调用的接口类
 * 
 * @author lap
 *
 */
public class ModenPostOffice {
	private ILetterProcess letterProcess = new LetterProcessImpl();
	private Police police = new Police();

	// 写信， 封装， 投递， 一体化
	public void sendLetter(String context, String address) {
		// 帮你写信
		letterProcess.writeContext(context);
		// 写好信封
		letterProcess.fillEnvelope(address);
		// 检查信件
		police.checkLetter(letterProcess);
		// 把信放到信封中
		letterProcess.letterInotoEnvelope();
		// 邮递信件
		letterProcess.sendLetter();
	}
}