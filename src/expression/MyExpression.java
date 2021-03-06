package expression;

import java.util.ArrayList;

public class MyExpression {

	private String expression;
	private ArrayList<String> postfixExpression;
	private String result;
	private boolean checkAnswer=true;

	public boolean isCheckAnswer() {
		return checkAnswer;
	}

	public void setCheckAnswer(boolean checkAnswer) {
		this.checkAnswer = checkAnswer;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public ArrayList<String> getPostfixExpression() {
		return postfixExpression;
	}

	public void setPostfixExpression(ArrayList<String> postfixExpression) {
		this.postfixExpression = postfixExpression;
	}

}
