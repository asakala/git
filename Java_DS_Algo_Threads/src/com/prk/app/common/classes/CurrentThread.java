package com.prk.app.common.classes;

public class CurrentThread {

	private static final ThreadLocal<Integer> THREAD_LOCAL_APP_ID = new ThreadLocal<Integer>() {
		protected Integer initialValue() {
			return -1;
		};
	};

	public static void setApplciationId(Integer applicationId) {
		THREAD_LOCAL_APP_ID.set(applicationId);
	}

	public static Integer getApplciationId() {
		return THREAD_LOCAL_APP_ID.get();
	}

}
