package entity;

import java.awt.Graphics2D;

import main.GamePanel;

public class Notas extends ScreenObject {

	public int identificador;

	public Notas() {
		identificador = (int) (Math.random() * 3);
		if (identificador == 0) {
			loadImagesFromStringWithExtension(
					"/Backgrounds/Entidades/Triangulo", 1, ".png");
		} else if (identificador == 1) {
			loadImagesFromStringWithExtension("/Backgrounds/Entidades/circulo",
					1, ".png");
		} else if (identificador == 2) {
			loadImagesFromStringWithExtension("/Backgrounds/Entidades/rombo",
					1, ".png");
		}
		this.width = 50;
		this.height = 50;
		this.setPosition(GamePanel.WIDTH + this.width, GamePanel.HEIGHT / 2);
		this.setLeft(false);

	}

	public void update() {
		x += dx;
		y += dy;
	}

	public void draw(Graphics2D g) {
		setMapPosition();
		super.draw(g);

	}

}
