# Modificadores de Acesso

- Utilização do modificador `private` para dar responsabilidade a Classe com a implementação da interface.

No geral, essa é uma boa regra:
- Atributos: private
- Métodos: public

O motivo é que a **interface** fica disponível para o usuário sem a necessidade de saber como está sendo **implementado** ou quais são os **atributos** do objeto (classe instanciada).

- Não é considerado uma boa prática gerar `getters` e `setters` para todos os atributos, somente para os que serão utilizados.

- **Java Beans** é toda classe que possui:
1. Atributos privados
2. Getters e Setters para manipulação desses atributos atraves de métodos
3. Um Construtor vazio por padrão.

