# Leonardo Serafin

## Objetivo
Repositório para manter os arquivos da aula

## Comandos importantes para lembrar
```
git clone {endereço}

git add . (adicionar tudo)

git add {nome do arquivo}

git commit -m "{mensagem do commit}" (commitar)

git log (ver o log)
 
git status (ver a situation do working dir)

git push (enviar para nuvem)

export PAGER= (retirando erros do computador da univali)
```

```java
public static void main (String args[]){
	int i = 0;
	i++;
}
```

| tabela | é | daora |
|--|--|--|
| Paulo | Jose | Leo |
| 1 | 2 | 3 |

> teste

---
 
Por hoje é só.

## Enviando para um arquivos
```
// exemplo de try, catch junto com alteração de arquivos
	try{
		Path caminho = Paths.get("arquivo.txt"); 
// se nao for falado de onde é o arquivo abre automaticamente o diretorio q se encontra o código

		String conteudo = "Bolinha\nQuadradinho";
		byte[] stringEmBytes = 
		Files.write(path, bytes);
		JOpt...("deu certo");
	}catch(Exception e){
		JOpt...("deu errado");
	}


```