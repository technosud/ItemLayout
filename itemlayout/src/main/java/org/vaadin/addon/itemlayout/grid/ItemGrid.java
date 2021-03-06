/**
 * NovaForge(TM) is a web-based forge offering a Collaborative Development and 
 * Project Management Environment.
 *
 * Copyright (C) 2007-2013  BULL SAS
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 */
package org.vaadin.addon.itemlayout.grid;

import org.vaadin.addon.itemlayout.layout.AbstractItemLayout;
import org.vaadin.addon.itemlayout.widgetset.client.grid.ItemGridState;

/**
 * @author Guillaume Lamirand
 */
public class ItemGrid extends AbstractItemLayout
{

  /**
   * Serial version id
   */
  private static final long serialVersionUID = -3884081463499999846L;

  public ItemGrid()
  {
    super();
  }

  public ItemGrid(final int columns)
  {
    super();
    setColumns(columns);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public ItemGridState getState()
  {
    return (ItemGridState) super.getState();
  }

  /**
   * Gets number of columns defined
   * 
   * @return the number of columns, by default 3
   */
  private int getColumns()
  {
    return getState().columns;
  }

  /**
   * Sets the number of column
   * 
   * @param pColumns
   */
  public void setColumns(final int pColumns)
  {
    if (getState().columns != pColumns)
    {
      getState().columns = pColumns;
      markAsDirty();
    }
  }

}