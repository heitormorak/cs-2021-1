# Tarefa 04 - Comandos Git

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


1. Qual o comando para obter a versão instalada do Git?
R: git --version

2. Qual o efeito da execução de cada um dos comandos abaixo?
  a. git help
     R: exibe a lista de comandos disponível do Git e suas funções

  b. git help checkout
R: abre a pagina local html que detalha o comando git checkout, usado para gerenciar as branchs do projeto.

  c. git help merge
R: abre a pagina local html que detalha o camando merge, usado para mesclar alterações nos repositórios.

  d. git init
R: cira um novo repositório Git

  e. git add --all
R: adiciona todos os arquivos do repositório para a staging area, incluindo os removidos.

  f. git add -u
R: adiciona somente os arquivos modificados e removidos a staging area. Os arquivos novos não são adicionados.

  g. git config -l
R: equivalente ao comando git config --list, que exibe as configurações do git

  h. git mv a.txt b.txt
R: renomeia o arquivo a.txt para b.txt. Para isso é necessário que o arquivo exista no diretório.

  i. git reset --hard
R: reverte todas as alterações da stage e do diretório para o estado do commit especificado. 

  j. git log -27
R: exibe o log dos últimos 27 commits

3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?
R: Para acrescentar as mudanças ao próximo commit utilizamos o comando git add. Para o commit, utilizamos git commit.

4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?
R: git status

5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?
git status --u

6. Qual o comando para efetuar um _commit_?
git commit -m "comentario"

7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?
git checkout --teste.txt

8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.
Para que todo o diretório seja ignorado, podemos incluir um arquivo .gitignore dentro do diretório. Assim ele será ignorado pelo git.

9. O que acontece se o seu repositório local for acidentalmente removido?
Se o repositório for excluído com o git aberto, os próximos comandos dentro desse repositório não serão executados, afinal o diretório não será encontrado na máquina local. Caso a exclusão seja feita após algum arquivo ter sido modificado/adicionado pelo comando git add, essas modificações serão perdidas. O repositório remoto terá o conteúdo do último push. Será necessário fazer uma nova cópia do repositório remoto através do git clone.

10. Como clonar um repositório remoto?
git clone https://github.com/usuario/repositorio.git

11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?
git log --pretty=oneline

12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?
.gitconfig

13. Qual o comando para criar um repositório local?
Primeiro é preciso navegar até o repositório local e então executar o comando git init.

14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?
O mesmo nome do diretório onde foi executado o comando.

15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)
git add -all

16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?
O SHA1 é um identificador único, usado para verificar a integridade do arquivo no Git. Essa criptografia hash impede que os arquivos sejam corrompidos ou perdidos.

17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?
-abbrev-commit

18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?
O git add -u adiciona somente os arquivos modificados e removidos. Os arquivos criados não são adicionados.

19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
**git reset --soft HEAD~1**
**git reset --hard**
O primeiro comando retorna o repositório para o último comigo, mas mantem os últimos arquivos no stage. O seguindo comando lista na tela o último commit feito.

20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?
git clean -f

21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?
.gitignore

22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?
Com um * podemos indicar que todos os arquivos serão ignorados. Nesse caso, com *.class, o git ignoraria todos os arquivos .class.

23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.


24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
**git shortlog -sne**?
O comando mostra o resumo do git log. As opções -sne mostram o número de commits do participante, classifica a lista de autores pelo número de commits e exibem o e-mail de cada autor, respectivamente.

25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?
Mostra a url de cada conexão remota, nesse caso, a url do repositório jquery

26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?
git tag 

27. Caso um dato repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?
git tag -l "2.0"

28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?
Cria uma tag anotada (-a) com a mensagem "minha versão ouro".

29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?
Mostra os dados da tag junto com o commit.

30. O que o comando **git push origin 3.4-gold** teria como efeito?
Enviaria a ramificação especificada para o repositório remoto. Nesse caso, somente os autores podem realizar estes envios.

31. Após executar um commit, qual o efeito de **git commit --amend**?
Permite modificar a mensagem do commit mais recente.

32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?
O git reset HEAD retira o arquivo da staging.

33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?
O git checkout vai descartar todas as mudanças do último commit.

34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?
O git reset retira o arquivo da staging, já o checkout vai descartar as mudanças do último commit.

35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.


INSTRUÇÕES:

1. No seu repositório pessoal, criar a pasta aula04.
2. Commitar este arquivo respondido nesta pasta.
3. A data limite para concluir esta tarefa é dia 31/07/2021, as 23h59min.

