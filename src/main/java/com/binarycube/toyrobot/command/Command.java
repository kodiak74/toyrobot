package com.binarycube.toyrobot.command;

public class Command {
	
	CommandType type;
	String[] params;

	public Command() {
		type = CommandType.NULL;
		params = null;
	}
	
	public Command(CommandType ct, String[] params) {
		this.type = ct;
		this.params = params;
	}

	

	public CommandType getType() {
		return type;
	}

	public String getParam(int idx) {
		if ((idx >= 0) && (idx < params.length)) return params[idx];
		return null;
	}
	
	/**
	 * Parses the parameter as an integer.
	 * TODO: add further checking to handle invalid int strings.
	 * @param idx
	 * @return
	 */
	public int getParamAsInt(int idx) {
		String tmp = getParam(idx);
		if (tmp == null) return 0;
		else return Integer.parseInt(tmp);
	}
	
	
	public String toString() {
		StringBuilder buffer= new StringBuilder(type.toString());
		if (params != null) {
			buffer.append("[");
			for (String x: params) {
				buffer.append(x).append(",");
			}
			buffer.append("]");
		}
		return buffer.toString();
	}
	
}
