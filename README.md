# Desafio de Busca de CEP com ViaCep API 🔎

Este repositório contém um projeto Java para buscar informações de endereço a partir de um CEP utilizando a API ViaCep. O objetivo é consolidar conhecimentos em manipulação de arquivos, requisições HTTP, tratamento de exceções e serialização de objetos em JSON.

## Passo a Passo

### 1. Testar a API ViaCep no Postman

- Acesse o [site da ViaCep](https://viacep.com.br) e utilize o Postman para testar as requisições e observar as informações retornadas.

### 2. Criar a Classe `Main`

- Crie uma classe principal chamada `Main` para iniciar o projeto.

### 3. Definir a Classe Record `Endereco`

- Crie uma classe record `Endereco` com os seguintes atributos:
String cep, String logradouro, String complemento, String bairro, String localidade, String uf.

### 4 Criar a Classe BuscaCep
- Crie uma classe BuscaCep e adicione um método para fazer a requisição HTTP à API ViaCep.

### 5 Capturar Exceções com Try/Catch
- Adicione um bloco try/catch no método de requisição para capturar e tratar possíveis Exception.

### 6 Retornar JSON com Gson
- Utilize a biblioteca Gson para converter o JSON de resposta em um objeto Endereco.

### 7 Testar a Requisição na Classe Main
- Permita ao usuário digitar o CEP usando Scanner e teste a requisição na classe Main.

### 8 Testar Casos de Erro
Teste a aplicação com diferentes entradas de CEP que causam erro:
- CEP com mais de 8 dígitos: 95010010
- CEP com espaço: 95010 10
- CEP com hífen: 95010-10
- CEP com letra: 95010a10

### 9 Lidar com Erros e Mensagens Personalizadas
- Capture os erros na classe Main e exiba mensagens personalizadas para cada tipo de erro (se necessário)

### 10 Salvar Dados em Arquivo JSON
- Utilizei a classe FileWriter para guardar os dados recebidos em um arquivo .json.

## Aprendizados

- Requisições HTTP: Como fazer requisições HTTP em Java usando a biblioteca HttpClient.
- Manipulação de JSON: Utilizar a biblioteca Gson para serializar e desserializar objetos em JSON.
- Tratamento de Exceções: Capturar e tratar exceções comuns em operações de I/O e parsing de JSON.
- Validação de Dados de Entrada: Validar e tratar diferentes tipos de entrada de dados para garantir a integridade e formato esperado.
- Interação com o Usuário: Ler dados de entrada do usuário usando a classe Scanner.
- Manipulação de Arquivos: Escrever dados em um arquivo usando a classe FileWriter.
- Mensagens Personalizadas de Erro: Fornecer feedback claro e específico para o usuário em caso de erro.