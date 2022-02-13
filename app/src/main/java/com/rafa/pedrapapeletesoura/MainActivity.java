package com.rafa.pedrapapeletesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void opcaopedraselecionada(View view){

        this.opcaoselecionada("Pedra");

    }

    public void opcaopapelselecionada(View view){

        this.opcaoselecionada("papel");

    }

    public void opcaotesouraselecionada(View view){ // Aqui voce está passando o metodo para o botão

        this.opcaoselecionada("Tesoura"); //Aqui vc está passando o parametro para o metodo  opcaoselecionada que vai reconhecer o click do usuario


    }

    public void  opcaoselecionada(String opcaoselecionada) { // Aqui ele pegando o metodo de cada evento de botão acima e colocado dentro do parametro  "opcaoselecionada" dessa forma quando o usaurio apaerta o botão, ele vai dar amarzenando nessemetoddo qual botão o usuario aperto
        TextView texto=findViewById(R.id.jogador);
        ImageView imagem = findViewById(R.id.computador);
        System.out.println(opcaoselecionada);

        int numero = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};

        String coputador = opcoes[numero];

        switch (coputador) { // Aqui estamos modificando a imagem de acordo com a variavel

             case "pedra":

                imagem.setImageResource(R.drawable.pedra);
                break;

             case "papel":

                imagem.setImageResource(R.drawable.papel);
                break;

             case "tesoura":

                imagem.setImageResource(R.drawable.tesoura);
                break;

        }

        if(coputador=="tesoura" && opcaoselecionada == "papel"){

            texto.setText("O computador ganhou");
        }

        if(coputador=="papel" && opcaoselecionada == "papel"){

            texto.setText("Deu empaati");
        }

        if(coputador=="pedra" && opcaoselecionada == "papel"){

            texto.setText("Voce ganhou");
        }

        if(coputador=="pedra" && opcaoselecionada == "Tesoura"){

            texto.setText("O computador ganhou");
        }

        if(coputador=="papel" && opcaoselecionada == "Tesoura"){

            texto.setText("Vc ganhou");
        }

        if(coputador=="tesoura" && opcaoselecionada == "Tesoura"){

            texto.setText("empatou");
        }

        if(coputador=="tesoura" && opcaoselecionada == "Pedra"){

            texto.setText("Vc ganhou");
        }

        if(coputador=="papel" && opcaoselecionada == "Pedra"){

            texto.setText("O PC ganhou");
        }
        if(coputador=="pedra" && opcaoselecionada == "Pedra"){

            texto.setText("foi um empate");
        }

    }
}