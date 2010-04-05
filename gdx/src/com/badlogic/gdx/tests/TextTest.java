/*
 *  This file is part of Libgdx by Mario Zechner (badlogicgames@gmail.com)
 *
 *  Libgdx is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Libgdx is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with libgdx.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.badlogic.gdx.tests;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.RenderListener;
import com.badlogic.gdx.backends.desktop.JoglApplication;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Font;
import com.badlogic.gdx.graphics.SpriteBatch;
import com.badlogic.gdx.graphics.Font.FontStyle;

public class TextTest implements RenderListener
{
	SpriteBatch spriteBatch;
	Font font;	
	
	public static void main( String[] argv )
	{
		JoglApplication app = new JoglApplication( "Text Test", 480, 320, false );
		app.getGraphics().setRenderListener( new TextTest() );
	}	

	@Override
	public void surfaceCreated(Application app) 
	{
		if( font == null )
		{		
			spriteBatch = new SpriteBatch(app.getGraphics());
			font = app.getGraphics().newFont( "Arial", 12, FontStyle.Plain, true );
		}
	}
	
	@Override
	public void render(Application app) 
	{
		spriteBatch.begin();
		spriteBatch.drawText( font, "this is a test", 100, 100, Color.WHITE );
		spriteBatch.end();
	}

	@Override
	public void dispose(Application app) 
	{	
		
	}
	
	@Override
	public void surfaceChanged(Application app, int width, int height) 
	{	
		
	}
}
