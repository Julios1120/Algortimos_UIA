/* MainWindow.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Oct ,31st    2007, Created by Jeff Liu
}}IS_NOTE

Copyright (C) 2007 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 3.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.zksandbox.grid;

import java.util.Comparator;

import org.zkoss.zul.AbstractListModel;
import org.zkoss.zul.ext.Sortable;
import org.zkoss.zul.event.ListDataEvent;
/**
 * 
 * @author Jeff
 *
 */
public class FakeListModel extends AbstractListModel implements Sortable {
	
	private int _size;
	private boolean _asc = true;

	public FakeListModel() {
		this(10000);
	}
	public FakeListModel(int size) {
		_size = size;
	}

	// Sortable
	public void sort(Comparator cmpr, boolean asc) {
		_asc = asc;
		invalidate();
	}
	public void invalidate() {
		fireEvent(ListDataEvent.CONTENTS_CHANGED, -1, -1);
	}

	//AbstractListModel
	public Object getElementAt(int v) {
		String value = "Option "+(_asc ? v: _size - v - 1);
		return value;
	}
	
	//AbstractListModel
	public int getSize() {
		return _size;
	}
	
	//AbstractListModel
	public void setSize(int size){
		_size = size;
	}
	public String getSortDirection(Comparator cmpr) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	
	protected void fireSelectionEvent(Object e) {
		if (e instanceof String) {
			String s = ((String) e).replace( "Option ", "");
			fireEvent(ListDataEvent.SELECTION_CHANGED, Integer.parseInt(s), -1);
		} else
			super.fireSelectionEvent(e);
	}
}
