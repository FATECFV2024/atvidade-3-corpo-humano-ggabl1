## Na classe Corpo_Humano inclua a linha c1.massa = "2"; logo depois de instanciar o objeto c1. Qual foi a ocorrência? Qual a conclusão sobre o que aconteceu?
    Não é possível modificar o valor de Massa dessa forma pois ele é um atributo com acesso privado, sendo assim, só é possivel altera-lo com a construção de getters e setters.

## Na classe Corpo_Humano altere a linha private float Massa para public float Massa; Qual foi a ocorrência? Qual a conclusão sobre o que aconteceu?
     Não ocorre nenhum erro mas, seguindo a logica, os getters e setters servem para acessar a Massa no momento que ele estiver privado. Então tornar o atributo publico só deixaria as informações vulneráveis.

## Na classe Corpo_Humano altere a linha public setVolume (float volume) para private setVolume (float volume).Qual foi a ocorrência? Qual a conclusão sobre o que aconteceu?
    Ao tornar o modificador de acesso privado, você impossibilita o setter de fazer a sua função, que é, justamente, modificar o valor do atributo.
