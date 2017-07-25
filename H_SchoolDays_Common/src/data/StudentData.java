package data;

import java.util.Set;

import com.himaginus.common.data.ResponseData;

public class StudentData implements ResponseData {

	private static final long serialVersionUID = 1L;

	// # Data Of Player
	private int id;
	private String nickName;
	private String title;
	private int exp_math;
	private int exp_science;
	private int exp_language;
	private int exp_music;
	private int exp_art;
	private int exp_exercise;

	private int morality;

	// # Getter / Setter
	public String getTitle() {
		return title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getExp_math() {
		return exp_math;
	}

	public void setExp_math(int exp_math) {
		this.exp_math = exp_math;
	}

	public int getExp_science() {
		return exp_science;
	}

	public void setExp_science(int exp_science) {
		this.exp_science = exp_science;
	}

	public int getExp_language() {
		return exp_language;
	}

	public void setExp_language(int exp_language) {
		this.exp_language = exp_language;
	}

	public int getExp_music() {
		return exp_music;
	}

	public void setExp_music(int exp_music) {
		this.exp_music = exp_music;
	}

	public int getExp_art() {
		return exp_art;
	}

	public void setExp_art(int exp_art) {
		this.exp_art = exp_art;
	}

	public int getMorality() {
		return morality;
	}

	public void setMorality(int morality) {
		this.morality = morality;
	}

	public int getExp_exercise() {
		return exp_exercise;
	}

	public void setExp_exercise(int exp_exercise) {
		this.exp_exercise = exp_exercise;
	}

}
