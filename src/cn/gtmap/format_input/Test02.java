package cn.gtmap.format_input;

/**
 * printf和format能够达到一模一样的效果，
 * 如何通过eclipse查看java源代码 可以看到，在printf中直接调用了format
 *
 */
public class Test02 {
	public static void main(String[] args) {
		String name = "盖伦";
		int kill = 8;
		String title = "超神";
		
		String sentenceFormat = "%s 在进行了连续%d 次击杀后，获得了 %s 的称号 %n";
		
		//使用printf格式化输出
		System.out.printf(sentenceFormat,name,kill,title);
		//使用format格式化输出
		System.out.format(sentenceFormat, name,kill,title);
	}
}
