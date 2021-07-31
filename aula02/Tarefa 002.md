# Tarefa 02 - API Rest
##API
Uma API, Interface de Programação de Aplicações, permite a comunicação de dados de forma facilitada entre as aplicações, não sendo necessário detalhes de implementações dessas aplicações para que elas troquem informações. Esses padrões podem ser escritos em XML, JSON ou YAML.
Assim, seguindo os padrões e rotinas que são disponibilizados por uma aplicação X, a aplicação Y consegue utilizar recursos desta de forma simplificada. Isso torna os sistemas amplamente comunicáveis, criando um ambiente interoperante, onde n sistemas trabalham em conjunto.

[![API](https://becode.com.br/wp-content/uploads/2017/02/API-768x520.png "API")](https://becode.com.br/wp-content/uploads/2017/02/API-768x520.png "API")

#### API privada
Uma API privada funcionam internamente entre os sistemas de uma mesma organização.

#### API pública
Uma API pública são abertas para uso livre de toda a comunidade.

#### API de parceiros
Uma API de parceiros são vendidas ou utilizadas em parcerias de empresas para a integração de diferentes softwares.

##REST
O REST, Transferência de Estado Representacional, é um protocolo sobre a arquitetura do sistema, que define as regras para a hierarquia do código. Seu objetivo é ajudar a construir interfaces de forma consistente, fornecendo regras, protocolos e padrões para melhor funcionamento, integração e manutenção dos web services. Algumas diretrizes REST:
- Cliente/servidor: cliente e servidor terão aplicações separadas.
- Sem estado: cada requisição executa apenas um tipo de ação, de forma independente
- Cache: para evitar envio recorrente de requisições ao servidor, a API utiliza um cache
- Interface uniforme: determina que os recursos sejam identificados, que sua manipulação seja por representação, com mensagens autodescritivas e utilize link para navegar pela aplicação.

##API REST
Como já mencionado, uma API permite utilizar funcionalidades ou trocar informações entre aplicações sem a necessidade de detalhar o código de cada uma delas. De forma segura e rápida pode-se integrar ERPs, sistemas, cloud, banco de dados, sites e os diversos tipos de aplicações existentes, feitas nas mais diversas plataformas e linguagens. 
Uma API REST é uma API que segue os padrões da arquitetura REST. Com ele, como também mencionado, podemos transferir os dados de forma independente. Essa transferência é feita via HTTP, permitindo as seguintes operações:
- POST: criar dados
- PUT: atualizar dados
- GET: pesquisar dados
- DELETE: deletar dados

####Vantagens
- As aplicações front-end e back-end são separadas em APIs REST, garantindo proteção aos dados, já que são feitas apenas trocas de informação. A aplicação requisitante não acessa diretamente a aplicação requisitada.
- O desenvolvimento dessas APIs é mais fácil, porque não se preocupa com detalhes de acoplamento. Uma mesma API se comunica com diferentes aplicações e servidores.
- Todas as requisições retornam, em geral (pois há outros formatos menos utilizados), no formato JSON. Isso padroniza todos os recebimentos, fazendo com que o front-end sempre faça o correto tratamento dos resultados independente do dispositivo utilizado.
- Funcionalidades são muito mais fáceis de serem incorporadas as aplicações ou sites, como pagamento, redes sociais, emissão de notas, chat, exibição de dados, etc. 

![REST](https://www.altexsoft.com/media/2021/03/word-image.png)
