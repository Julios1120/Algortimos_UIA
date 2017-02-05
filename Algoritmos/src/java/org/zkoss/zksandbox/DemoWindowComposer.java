/* DemoWindowComposer.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Nov 13, 2008 10:36:53 AM , Created by jumperchen
}}IS_NOTE

Copyright (C) 2008 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 3.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.zksandbox;

import org.zkoss.zk.ui.Components;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Path;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Div;
import org.zkoss.zul.Tab;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

/**
 * @author jumperchen
 */
@SuppressWarnings("serial")
public class DemoWindowComposer extends GenericForwardComposer<Window> {
	Window view;
	Tab demoView;
	Textbox codeView;
	Button reloadBtn;
	Button tryBtn;
	
	
	public void doAfterCompose(Window comp) throws Exception {
		super.doAfterCompose(comp);
		comp.setContentSclass("demo-main-cnt");
		comp.setSclass("demo-main");
		final Div inc = new Div();
		Executions.createComponents("/bar.zul", inc, null);
		inc.setStyle("float:right");
		comp.insertBefore(inc, comp.getFirstChild());
		if (view != null) execute();
	}
	
	public void execute() {
		Components.removeAllChildren(view);
		String code = codeView.getValue();
		try {
			if (tryBtn.isVisible()) {
				Executions.createComponentsDirectly(code, "zul", view, null);
			} else { 
				Executions.createComponents("/macros/warning.zul", view, null);
			}
		} catch (RuntimeException e) {
			if ("true".equalsIgnoreCase(System.getProperty("zksandbox.debug")))
				System.out.println("\n Error caused by zksandbox at : " + new java.util.Date() + "\n code: " + code);
			throw e;
		}
	}
	
	public void onClick$reloadBtn(Event event) {
		demoView.setSelected(true);
		Path.getComponent("//userGuide/xcontents").invalidate();
	}
	
	public void onClick$tryBtn(Event event) {
		demoView.setSelected(true);
		execute();
	}
}
