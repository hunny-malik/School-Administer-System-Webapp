package com.entity;

public class values1 {
	private int id;
	private String name;
	private String english;
	private String math;
	private String physics;
	private String chemistry;
	private String biology;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}

	public String getPhysics() {
		return physics;
	}

	public void setPhysics(String physics) {
		this.physics = physics;
	}

	public String getChemistry() {
		return chemistry;
	}

	public void setChemistry(String chemistry) {
		this.chemistry = chemistry;
	}

	public String getBiology() {
		return biology;
	}

	public void setBiology(String biology) {
		this.biology = biology;
	}

	public values1() {
		super();
	}

	public values1(int id, String name, String english, String math, String physics, String chemistry, String biology) {
		super();
		this.id = id;
		this.name = name;
		this.english = english;
		this.math = math;
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
	}

	public values1(String name, String english, String math, String physics, String chemistry, String biology) {
		super();
		this.name = name;
		this.english = english;
		this.math = math;
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
	}

	@Override
	public String toString() {
		return "values1 [id=" + id + ", name=" + name + ", english=" + english + ", math=" + math + ", physics="
				+ physics + ", chemistry=" + chemistry + ", biology=" + biology + "]";
	}

}
