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
		manager.load("data/test1.jpg",Texture.class);//���ص�Ԥ���ض���..
		
		
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
		Gdx.gl.glClearColor(1, 1, 1, 1);// ���ñ���Ϊ��ɫ
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);// ����
		
		manager.update();//����Դ���ؽ���
		
		System.out.println("-------------->progress: " + manager.getProgress());//��ȡ��Դ�ļ��ؽ���(���ݼ�����Դ�ĸ���������)..
		
		batch.begin();
		
		
		if(manager.isLoaded("data/test1.jpg") == true){//�ж�һ����Դ�Ƿ��Ѿ����ؽ���
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
