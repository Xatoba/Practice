/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrey_lab04;

import andrey_lab03.View;

public class Main extends andrey_lab03.Main {


    public Main(View view) {
        super(view);
    }

    public static void main(String[] args) {
        Main main = new Main(new ViewableTable().getView());
        main.menu();
    }
}
