@RestController //Indica que por padrão responderá usando o formato json.
@RequestMapping("/") //Mapeamento de urls dos metódos pertencentes a este controller.
@GetMapping("/{}") //Usado para declarar um path dinâmico.
@Autowired //Anotação para indicar a injeção de dependências (processo de prover instâncias de classes necessárias ao objeto.
@PostMapping //Mapeamento do método salvar.
@RequestBody //Indica que o objeto deve ser buscado no corpo da requisição.
@Valid //Validação de dados.
ResponseEntity //Manipulação de respostas HTTP (código de status, headers e body).
@Repository //Faz o framework enxergar a classe responsável por acessar o banco de dados.

padrão DTO (Data Transfer Object) // Utilizado para otimizar a comunicação entre cliente e servidor / Customização de dados.
@Transactional //Ao finalizar o método, o Spring efetuará o commit automático da transação, caso nenhuma exception tenha sido lançada.
@DeleteMapping //Exclusão de registros.
@PathVariable //Recebe parâmetros dinâmicos no path da URL.

@PageableDefault //Indica o padrão de paginação/ordenação ao Spring, quando o cliente não enviar informações adicionais.