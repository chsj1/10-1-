package com.example.hellolibgdx;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class MyGame implements ApplicationListener {

	Texture texture;
	SpriteBatch batch;
	
	AssetManager manager;
	
	
	@Override
	public void create() {
		batch = new SpriteBatch();
		
		manager = new AssetManager();
		manager.load("data/test1.jpg",Texture.class);//加载到预加载队列..
		
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}
	
	
	
	
	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 1, 1, 1);// 设置背景为白色
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);// 清屏
		
		manager.update();//把资源加载进来
		
		System.out.println("-------------->progress: " + manager.getProgress());//获取资源的加载进度(根据家在资源的个数来计算)..
		
		batch.begin();
		
		
		if(manager.isLoaded("data/test1.jpg") == true){//判断一个资源是否已经加载进来
			batch.draw(manager.get("data/test1.jpg",Texture.class), 0,0);
		}
		
		batch.end();
	}

	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

}
