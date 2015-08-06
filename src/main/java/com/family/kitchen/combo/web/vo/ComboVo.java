package com.family.kitchen.combo.web.vo;

import com.family.kitchen.combo.ao.ComboAo;
import com.family.kitchen.combo.po.Combo;

public class ComboVo {

	private Combo combo;

	private ComboAo comboAo;
	
	public Combo getCombo() {
		return combo;
	}

	public void setCombo(Combo combo) {
		this.combo = combo;
	}

	public ComboAo getComboAo() {
		return comboAo;
	}

	public void setComboAo(ComboAo comboAo) {
		this.comboAo = comboAo;
	}
	
}
