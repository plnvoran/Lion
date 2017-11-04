package Lion.Data;

public class Lion {

	public String state;
	public String statePrevious;
	public String action;
	public String msg;
	public String error;
	public String quit;

	

	public Lion() {
	//	super();
		this.state = "";
		this.statePrevious = "";
		this.action = "";
		this.msg = "";
		this.error = "";
		this.quit="";
	}

	

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatePrevious() {
		return statePrevious;
	}

	public void setStatePrevious(String statePrevious) {
		this.statePrevious = statePrevious;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getQuit() {
		return quit;
	}

	public void setQuit(String quit) {
		this.quit = quit;
	}
	public Lion withState(String state) {
		this.state = state;
		return this;
	}

	public Lion withStatePrevious(String statePrevious) {
		this.statePrevious = statePrevious;
		return this;
	}

	public Lion withAction(String action) {
		this.action = action;
		return this;
	}

	public Lion withMsg(String msg) {
		this.msg = msg;
		return this;
	}

	public Lion withError(String error) {
		this.error = error;
		return this;
	}

	@Override
	public String toString() {
		return "Lion [state=" + state + ", statePrevious=" + statePrevious + ", action=" + action + ", msg=" + msg
				+ ", error=" + error + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((action == null) ? 0 : action.hashCode());
		result = prime * result + ((error == null) ? 0 : error.hashCode());
		result = prime * result + ((msg == null) ? 0 : msg.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((statePrevious == null) ? 0 : statePrevious.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lion other = (Lion) obj;
		if (action == null) {
			if (other.action != null)
				return false;
		} else if (!action.equals(other.action))
			return false;
		if (error == null) {
			if (other.error != null)
				return false;
		} else if (!error.equals(other.error))
			return false;
		if (msg == null) {
			if (other.msg != null)
				return false;
		} else if (!msg.equals(other.msg))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (statePrevious == null) {
			if (other.statePrevious != null)
				return false;
		} else if (!statePrevious.equals(other.statePrevious))
			return false;
		return true;
	}

	

}
